# AndroidMLModelDeserializer

This tool allows you to use pretrained models in you android App

# How to use

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

# How to use the model

To transform your serialized model in a usable object you will have to use the following method passing the file name after the context
```
val deserializer = Deserializer<ElasticClassifier>()
val elasticClassifier: ElasticClassifier = deserializer.getObject(this, "iris.model")
```

Once you have your model you can perform your predction
```
val predictedClass = elasticClassifier!!.classify(Arrays.asList(5.1, 3.5, 1.4, 0.2) as List<Any>?)
```
