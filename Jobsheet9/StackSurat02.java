package Jobsheet9;

public class StackSurat02 {
    Surat02[] stack;
    int size;
    int top;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat02 srt) {
        if (!isFull()) {
            stack[++top] = srt;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                return true;
            }
        }
        return false;
    }
}
