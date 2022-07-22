package ru.masaviktoria.datastructures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> list;

    public Stack(){
        this.list = new ArrayList<>();
    }

    public Stack(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public int size(){
        return list.size();
    }

    public void push(T value){
        list.add(value);
    }

    public T pop(){
        if (!list.isEmpty()) {
            T returnT = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return returnT;
        }else {
            throw new EmptyStackException();
        }
    }

    public T peek (){
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }else {
            throw new EmptyStackException();
        }
    }

    public void clear(){
        if(!list.isEmpty()){
            list.clear();
        }
    }
}
