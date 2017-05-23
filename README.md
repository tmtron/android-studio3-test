# android-studio3-test

After upgrading to Android Studio 3.0 we also must use the new android gradle plugin 
`com.android.tools.build:gradle:3.0.0-alpha1` and we should be able to use the
java-library gradle plugin (instead of the java plugin) for java-only modules.

But this does not work: see tag [java-library-plugin](https://github.com/tmtron/android-studio3-test/tree/java-library-plugin)

The problem was in the gradle version. Updading to version `4.0-milestone-2` fixed the issue [changes](https://github.com/tmtron/android-studio3-test/commit/08d529a0cbc2ebb8c87a128df4f4e28d70c1b84b)

Working tag: [java-library-plugin-OK](https://github.com/tmtron/android-studio3-test/tree/java-library-plugin-OK)

see also:
 * Stackoverflow [When using gradle 'java-library' the classes in the library cannot be referenced](https://stackoverflow.com/questions/44099501/when-using-gradle-java-library-the-classes-in-the-library-cannot-be-referenced)
 * [Gradle Forum](https://discuss.gradle.org/t/when-using-gradle-java-library-the-classes-in-the-library-cannot-be-referenced/22742)
