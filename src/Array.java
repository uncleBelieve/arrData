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
            throw new IllegalArgumentException("index Fail");
        for(int i = size-1;index<=i;i--)
            data[i+1]=data[i];


        data[index]=e;
            size++;


    }

    //获取index索引位置的元素
    int get(int index ){
        if(index<0||index>size)
            throw new IllegalArgumentException("index Fail");
        return data[index];
    }

    //修改index索引位置的元素
    void set(int index ,int e){
        if(index<0||index>size)
            throw new IllegalArgumentException("index Fail");
        data[index]=e;
    }

    @Override
    public String toString(){
        StringBuilder res  =  new StringBuilder();
        res.append(String.format("Array:size=%d,capacity=%d\n",size ,data.length));
        res.append('[');
        for(int i=0;i<size;i++)
        {
            res.append(data[i]);
            if(i!=size-1)
                res.append(",");
        }
        res.append(']');
        return res.toString();
    }

    //查找数组中是否有元素e
//    public boolean contains(int e){
//
//    }
}