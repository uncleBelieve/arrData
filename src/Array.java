/**
 * @Author hjy
 * @Date 2019/10/15 14:31
 * @desc 构造动态数组
 */
public class Array {

    private int []data;
    private int size;
    public Array(int capacity){
        data = new int [capacity];
        size = 0;
    }


    public Array(){
        this(10);
    }

    //获取数组中的元素个数
    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    //获取数组是否为空
    public boolean isEmpty(){
        return size==0;
    }
}