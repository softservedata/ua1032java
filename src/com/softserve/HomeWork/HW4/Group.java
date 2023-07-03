package com.softserve.HomeWork.HW4;

public enum Group {
    PMA_11{
        public Group nextGroup(){
            return PMA_21;
        }
    },
    PMA_21{
        public Group nextGroup(){
            return PMA_31;
        }
    },

    PMA_31{
        public Group nextGroup(){
            return PMA_41;
        }
    },
    PMA_41{
        public Group nextGroup(){
            return NO_GROUP;
        }
    },
    NO_GROUP{
        public Group nextGroup(){
            return NO_GROUP;
        }
    };

    public abstract Group nextGroup();
}
