package theroy;

public class Memento {
    private String state;
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateMemnto(){
        return new Memento(state);
    }

    // 通过备忘录对象，恢复对象
    public void getStateFrom(Memento memento){
        state = memento.getState();
    }
}
