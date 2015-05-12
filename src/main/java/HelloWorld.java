import java.util.Map;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;


public class HelloWorld {
	public static void main(String[] args) {
		Config config = new Config();
		HazelcastInstance instance = Hazelcast.newHazelcastInstance(null);
		Map<Integer, String> customers = instance.getMap("customers");
		customers.put(1, "SRK");
		customers.put(2, "Madhuri");
		customers.put(3, "Mithoon");
		
		System.out.println(">> Size --> " + customers.size());
	}
}
