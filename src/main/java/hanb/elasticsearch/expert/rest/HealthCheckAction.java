package hanb.elasticsearch.expert.rest;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.BytesRestResponse;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.RestStatus;

public class HealthCheckAction extends BaseRestHandler {
	@Inject
	protected HealthCheckAction(Settings settings, Client client, RestController controller) {
//		super(settings, controller, client); // over 1.4
		super(settings, client); // over 1.3
		controller.registerHandler(RestRequest.Method.GET, "/_healthcheck", this);
	}

	@Override
	public void handleRequest(RestRequest request, RestChannel channel, Client client) {
		channel.sendResponse(new BytesRestResponse(RestStatus.OK, "OK"));
		return;
	}
}
