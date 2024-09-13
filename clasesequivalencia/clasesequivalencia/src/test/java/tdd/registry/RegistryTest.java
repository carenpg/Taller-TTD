package tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("Nata",2,20,Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);

    }
    @Test
    public void AliveRegistryResult() {
        Person person = new Person("Nata",2,20,Gender.FEMALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);

    }
    @Test
    public void validateRegistryResultWithInvalidAge() {
        Person juan = new Person("Juan",4,-17,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(juan);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateRegistryResultWithUnderage() {
        Person caren = new Person("Caren",3,15,Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(caren);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryResultWithInvalidAge2() {
        Person miguel = new Person("Miguel",4,120,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(miguel);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

}
