import org.pk.level1.Level1Service;
import org.pk.level1.Level1ServiceImpl;

public class Level2ServiceImpl implements Level2Service {
	
	public void doSomething() {
		Level1Service svc = new Level1ServiceImpl();
		svc.foo(10);
	}
}
