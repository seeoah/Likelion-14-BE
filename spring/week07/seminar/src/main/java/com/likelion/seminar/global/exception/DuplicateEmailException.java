package com.likelion.seminar.global.exception;

public class DuplicateEmailException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "이미 존재하는 이메일입니다.";

    public DuplicateEmailException(String message) {
        super(message);
    }

    public DuplicateEmailException() {
        super(DEFAULT_MESSAGE);
    }
}
