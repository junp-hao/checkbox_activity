package com.example.andriod_demo;

public class Question {
    int resId;
    boolean answerTrue;

    public Question(int resId, boolean answerTrue) {
        this.resId = resId;
        this.answerTrue = answerTrue;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.answerTrue = answerTrue;
    }
}
