package Deserializer;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;

import java.io.ObjectInputStream;

import machinelearning.ElasticClassifier;

public class Deserializer {

    final static String TAG = "DeserializerTag";

    public static ElasticClassifier getMLModel(Context context, String fileName) {

        try {
            ObjectInputStream localObjectInputStream = new ObjectInputStream(context.getAssets().open(fileName));
            ElasticClassifier localElasticClassifier = (ElasticClassifier)localObjectInputStream.readObject();
            localObjectInputStream.close();
            return localElasticClassifier;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, e.toString());
        }
        return null;
    }
}
