package hanb.elasticsearch.expert.plugin.registry;

import hanb.elasticsearch.expert.rest.HealthCheckAction;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.rest.RestModule;
import org.elasticsearch.script.ScriptModule;

public class HealthCheckPlugin extends AbstractPlugin {
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "health-check";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "elasticsearch(http) health check.";
	}
	
	// 등록 하는 방식은 아래 두 가지다 동작 함.
	@Override
	public void processModule(Module module) {
	    if (module instanceof RestModule) {
	      ((RestModule) module).addRestAction(HealthCheckAction.class);
	    }
	}
	
//	public void onModule(RestModule module) {
//        module.addRestAction(HealthCheckAction.class);
//    }
}
