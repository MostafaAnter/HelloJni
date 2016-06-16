#include <jni.h>

JNIEXPORT jstring JNICALL
Java_perfect_1apps_hellojni_MainActivity_getMsgFromJni(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "mostafa Anter");
}