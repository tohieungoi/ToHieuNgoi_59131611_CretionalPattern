/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author tohie
 */
public class MyStringBuilder {
    String str;
    protected MyStringBuilder(Builder builder)
    {
        this.str=builder.str;
    }
    public static class Builder
         {
                String str="";

        public Builder() {
        }

        public Builder addString(String str) {
            this.str+= str;
            return this;
        }
         public Builder addFloat(Float f) {
            this.str += Float.toString(f);
            return this;
        }
          public Builder addBoolean(Boolean b) {
            this.str+= Boolean.toString(b);
            return this;
        }
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
                
        
     }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
       
}
