package com.company;

public class NestedClass {
    private int outerClassField;
    public int getOuterClassField(){ return outerClassField;}

    class InnerClass{
        void changeOuterClassField(){
            //cannot do this if static
            outerClassField = 5;
        }
    }
}
