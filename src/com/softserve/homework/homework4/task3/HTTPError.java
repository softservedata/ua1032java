package com.softserve.homework.homework4.task3;

public enum HTTPError {
    ERR400 {
        public String getError() { return "Bad Request"; }
    },
    ERR401 {
        public String getError() { return "Unauthorized"; }
    },
    ERR402 {
        public String getError() { return " Payment Required"; }
    },
    ERR403 {
        public String getError() { return "Forbidden"; }
    },
    ERR404 {
        public String getError() { return "Not Found"; }
    },
    ERR405{
        public String getError() { return "Method Not Allowed"; }
    };

    public abstract String getError();
}
