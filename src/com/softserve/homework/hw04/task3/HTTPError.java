package com.softserve.homework.hw04.task3;

public enum HTTPError {
    INTERNAL_SERVER_ERROR_500{
            public HTTPError showInfo(){ return INTERNAL_SERVER_ERROR_500;}
    },
    FORBIDDEN_403 {
        public HTTPError showInfo(){ return FORBIDDEN_403;}
    },
    NOT_FOUND_404 {
        public HTTPError showInfo(){ return NOT_FOUND_404;}
    },
    BAD_REQUEST_400 {
        public HTTPError showInfo(){ return BAD_REQUEST_400;}
    },
    UNAUTHORIZED_401 {
        public HTTPError showInfo(){ return UNAUTHORIZED_401;}
    }
}
