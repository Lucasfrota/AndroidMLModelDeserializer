package Deserializer;

import android.content.Context;

import java.io.ObjectInputStream;

import machinelearning.ElasticClassifier;

public class Deserializer {

    private ElasticClassifier getClassifierInterface(Context context, String fileName) {

        try {
            ObjectInputStream localObjectInputStream = new ObjectInputStream(context.getAssets().open(fileName));
            ElasticClassifier localElasticClassifier = (ElasticClassifier)localObjectInputStream.readObject();
            localObjectInputStream.close();
            return localElasticClassifier;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
