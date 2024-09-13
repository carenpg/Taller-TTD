package tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge()<0) return RegisterResult.INVALID_AGE;
        if (p.isAlive()==false) return RegisterResult.DEAD;
        if (p.getAge()<18) return RegisterResult.UNDERAGE;
        if (p.getAge()>=120) return RegisterResult.INVALID_AGE;
        return RegisterResult.VALID;
    }
}
