package com.amarmodi.jpa.hibernate.transactional.model.inheritencee;

class MyGen<T>{
    T obj;
    void add(T obj)
    {
        this.obj=obj;
    }
    T get()
        {
            return obj;
        }

    public static void main(String[] args) {
        MyGen<Integer> m = new MyGen<>();
        m.add(2);
    }
}  