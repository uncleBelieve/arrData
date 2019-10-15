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

    //向数组添加元素
    public void addLast(int e){
        if(size==data.length)
            throw new IllegalArgumentException("AddLast Fail");
        data[size]=e;
        size++;

        //add(size,e);
    }

    //向数组指定位置添加
    public void add(int index,int e){
        if(size==data.length)
            throw new IllegalArgumentException("AddLast Fail");
        if(index<0||index>size)
            throw new IllegalArgumentException("dev Fail");
        for(int i = size-1;index<=i;i--)
            data[i+1]=data[i];


        data[index]=e;
            size++;


    }
}