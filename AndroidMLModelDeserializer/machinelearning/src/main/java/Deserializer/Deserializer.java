package Deserializer;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;

import java.io.ObjectInputStream;

import machinelearning.ElasticClassifier;

public class Deserializer<T> {

    final static String TAG = "DeserializerTag";

    public T getMLModel(Context context, String fileName) {

        try {
            ObjectInputStream localObjectInputStream = new ObjectInputStream(context.getAssets().open(fileName));
            T object = (T)localObjectInputStream.readObject();
            localObjectInputStream.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, e.toString());
        }
        return null;
    }
}
