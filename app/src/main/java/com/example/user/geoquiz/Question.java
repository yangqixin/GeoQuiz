package com.example.user.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTure;
    public Question(int textResId,boolean answeTrue){
        mTextResId=textResId;
        mAnswerTure=answeTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTure() {
        return mAnswerTure;
    }

    public void setAnswerTure(boolean answerTure) {
        mAnswerTure = answerTure;
    }
}
