Kotlin Dagger Dependency Inject Demo
==============================

在Kotlin中使用Dagger

1. 需要在`build.gradle.kts`中声明相应的compiler插件
2. 需要手动`./gradlew build`，或者在Idea中运行`build`任务，生成相应代码
3. 生成的代码在 `build/generated/source/kapt/main/`

```
./gradlew compileKotlin
```

在Ide中运行`Hello.kt`