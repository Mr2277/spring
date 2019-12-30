package com.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;


public class KryoUtil {
    public static byte[] serializeKryo(Object o){
        Kryo kryo=new Kryo();
        kryo.setReferences(false);
        //kryo.register(o.getClass());
        Output output=new Output(128,10240);
        kryo.writeObject(output,o);
        byte[] result=output.toBytes();
        output.flush();
        output.close();
        return result;
    }
    public static Object deserialize(byte[] bytes){
        Kryo kryo=new Kryo();
        Input input=new Input(bytes);
        return kryo.readClassAndObject(input);
    }
}
