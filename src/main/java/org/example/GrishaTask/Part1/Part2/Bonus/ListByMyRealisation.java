package org.example.GrishaTask.Part1.Part2.Bonus;

public class ListByMyRealisation {

    private int len = 0;
    private int maxlen;
    Node[] array;
    Node end;
    Node temp;

    class Node {
        Node next;
        Node last;
        int value;

        public Node(Node next, Node last, int value) {
            this.next = next;
            this.last = last;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setLast(Node last) {
            this.last = last;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public ListByMyRealisation() {
        maxlen = 10;
        array = new Node[maxlen];
    }

    public ListByMyRealisation(int len) {
        array = new Node[len];
        maxlen = len;
    }

    public int getLen() {
        return len;
    }

    public void add(int a) {
        if (len < maxlen) {
            if (len == 0) {
                end = new Node(null, null, a);
                array[len] = end;
                len++;
            } else {
                end = new Node(end, null, a);
                array[len] = end;
                len++;
            }
        } else {
            this.icrreaceArray();
            end = new Node(end, null, a);
            array[len] = end;
            len++;
        }
    }

    public void add(int value, int index) {
        if (len + 1 < maxlen) {
            if (index == 0) {
                Node plus = array[index];
                temp = new Node(null, plus, value);
                array[0] = temp;
                end = array[len];
                len++;
            } else {
                Node minus = array[index - 1];
                Node plus = array[index];
                temp = new Node(minus, plus, value);
                array[index] = temp;
                len++;
            }
        } else {
            this.icrreaceArray();
            Node minus = array[index - 1];
            Node plus = array[index];
            temp = new Node(minus, plus, value);
            array[index] = temp;
            len++;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            if (len > 1) {
                array[index + 1].setLast(null);
            }
            array[index] = null;
            end = array[index + 1];
        } else if (index == len - 1) {
            array[index - 1].setNext(null);
            array[index] = null;
        } else {
            Node plus = array[index - 1];
            Node minus = array[index + 1];

            plus.setLast(minus);
            minus.setNext(plus);
            array[index] = null;
        }
        len--;
    }

    public boolean CompareToMyList(ListByMyRealisation a, ListByMyRealisation b) {
        if (a.len != b.len) {
            return false;
        } else {
            for (int i = 0; i < a.len; i++) {
                if (a.array[i].getValue() != b.array[i].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void icrreaceArray() {
        maxlen = array.length * 2;
        Node[] arr = new Node[maxlen];
        System.arraycopy(array, 0, arr, 0, array.length);
        array = arr;
    }

    public String otput() {
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < len; i++) {
            ab.append(array[i].value).append(" ");
        }
        return ab.toString();
    }

    public static void quickSort(Node[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // Рекурсивно сортируем подмассивы
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(Node[] arr, int low, int high) {
        int pivot = arr[high].getValue();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getValue() < pivot) {
                i++;

                int temp = arr[i].getValue();
                arr[i].value = arr[j].getValue();
                arr[j].value = temp;
            }
        }

        int temp = arr[i + 1].getValue();
        arr[i + 1].value = arr[high].getValue();
        arr[high].value = temp;

        return i + 1;
    }

    public void clear() {
        array = new Node[10];
        len = 0;
        end = null;
    }
}
