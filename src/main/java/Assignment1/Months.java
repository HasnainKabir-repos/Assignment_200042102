package Assignment1;

public enum Months implements Month {
    JANUARY{
        @Override
        public int getDays(){
            return 31;
        }
    },
    FEBRUARY{
        @Override
        public int getDays(){
            Calendar calendar = new Calendar();
            return calendar.checkLeapYear() ? 29 : 28;
        }
    },
    MARCH{
        @Override
        public int getDays(){
            return 31;
        }
    },
    APRIL{
        @Override
        public int getDays(){
            return 30;
        }
    },
    MAY{
        @Override
        public int getDays(){
            return 31;
        }
    },
    JUNE{
        @Override
        public int getDays(){
            return 30;
        }
    },
    JULY{
        @Override
        public int getDays(){
            return 31;
        }
    },
    AUGUST{
        @Override
        public int getDays(){
            return 31;
        }
    },
    SEPTEMBER{
        @Override
        public int getDays(){
            return 30;
        }
    },
    OCTOBER{
        @Override
        public int getDays(){
            return 31;
        }
    },
    NOVEMBER{
        @Override
        public int getDays(){
            return 30;
        }
    },
    DECEMBER{
        @Override
        public int getDays(){
            return 31;
        }
    };


}
