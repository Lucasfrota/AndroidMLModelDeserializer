# AndroidMLModelDeserializer

This tool allows you to use pretrained machine learning models in you android App easily

# Why to use?

If your Application needs to run a simple machine learning prediction job and you don't want to spend money in expensive web services this tool is perfect for you! through the Java object serialization we save your pretrained ML model allowing you use it in your android App.

# How to install

Add in your project build.gradle at the end of repositories
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

add in the module build.gradle the dependency
```
dependencies {
    ...
    implementation 'com.github.Lucasfrota:AndroidMLModelDeserializer:1.0.0'
    ...
}
```

# How to import model file

The first step to use a pretrained ML model in your Android App is importing the model file, for this you'll need to create assets folder in your Android Studio project by selecting in the top menu **File > new > Folder > Assets Folder**. Once it is done just paste your model file to this folder, if you don't have your own model you can use this [iris sample model](https://github.com/Lucasfrota/AndroidMLModelDeserializer/blob/master/MLModels/iris.model) for testing.


# How to use the model

To transform your serialized model in a usable object you will have to use the following method passing the file name after the context as shown below
```
val deserializer = Deserializer<ElasticClassifier>()
val elasticClassifier: ElasticClassifier = deserializer.getObject(this, "iris.model")
```

Once you have your model you can perform your predctions
```
val predictedClass = elasticClassifier!!.classify(Arrays.asList(5.1, 3.5, 1.4, 0.2) as List<Any>?)
```

# How to create a custom ML Model

To train a custom ML Model you may follow this [tutorial]().
