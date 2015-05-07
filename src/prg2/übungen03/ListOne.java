/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen03;

import java.util.ArrayList;

/**
 *
 * @author Caro
 */
public class ListOne implements IList {
    
    private ArrayList<Integer> list;

    public ListOne() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(int item) {
        list.add(item);
    }

    @Override
    public boolean remove(int item) {
        return list.remove((Integer) item);
    }

    @Override
    public boolean removeValue(int value) {
        return list.remove((Integer) value);
    }

    @Override
    public boolean removeValues(int value) {
        while(list.contains(value)) {
            list.remove((Integer)value);
        }
        return !list.contains(value);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean exists(int item) {
        return list.contains(item);
    }

    @Override
    public void print() {
        System.out.print(list.toArray());
    }
    
    
    
}
