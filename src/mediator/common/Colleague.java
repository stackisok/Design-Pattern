package mediator.common;

    /***
     *
     *@Author ChenjunWang
     *@Description:同事抽象类
     *@Date: Created in 10:54 2018/4/12
     *@Modified By:
     *
     */
    public abstract  class Colleague {
        protected Mediator mediator;
        public void setMediator(Mediator mediator) {
            this.mediator = mediator;
        }
        public abstract void operation();
    }
