package visitor;

public abstract class Action {
    // 得到男性得测评
    public abstract void getManResult(Man man);

    // 得到男性得测评
    public abstract void getWomanResult(Woman woman);
}
