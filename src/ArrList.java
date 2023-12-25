public class ArrList <type>{
    private type[] arr;
    private int size;
    private int pos;
    public ArrList() {
        this.arr  = (type[])(new Object[10]);
        size = 10;
        pos = 0;
    }

    public ArrList(int size){
        this.arr  = (type[])(new Object[size]);
        this.size = 10;
        pos = 0;
    }

    public void add(type element){
        if(pos == size){
            type[] a = (type[])(new Object[(size*3)/2+1]);
            size = (size*3)/2+1;
            for (int i = 0; i < arr.length; i++) {
                a[i] = arr[i];
            }
            arr = a;
        }
        arr[pos] = element;
        pos++;

    }

    public void add(type element,int index){
        if(pos == size){
            type[] a = (type[])(new Object[(size*3)/2+1]);
            size = (size*3)/2+1;
            for (int i = 0; i < arr.length; i++) {
                a[i] = arr[i];
            }
            arr = a;
        }
        if(arr[index] != null) {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i-1];
            }
        }
        arr[index] = element;
        pos++;
    }

    public void delete(){
        arr[pos] = null;
        pos--;
    }

    public void delete(int index){
        if(arr[index] != null) {
            for (int i = index; i < pos; i++) {
                arr[i] = arr[i+1];
            }
            pos--;
        }
    }

    public void show(){
        for (int i = 0; i < pos; i++) {
            if(arr[i] != null){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public void show(int index){
        System.out.println(arr[index]);
    }

    public boolean containe(type element){
        for (int i = 0; i < pos; i++) {
            if(arr[i] == element){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        arr = null;
        size = 0;
        pos = 0;
    }

}
