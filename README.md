# hanb-elasticsearch-expert-plugin
- 실무 예제로 배우는 Elasticsearch - 활용편
- elasticsearch plugin 제작 프로젝트로 health check plugin 코드를 제공 합니다.

# Health Check REST API URL
- Request
 - http://localhost:9200/_healthcheck
- Response : 요청에 따른 처리를 하고 결과를 넘겨 줍니다.
 - OK


# Health Check Plugin 등록
- 경로 : plugins/health-check
- jar : hanb-elasticsearch-expert-plugin-0.0.1.jar

# es-plugins.properties
- elasticsearch.yml에 별도 등록 없이 실행 시 자동으로 plugin 등록 되도록 지원 합니다.
plugin=hanb.elasticsearch.expert.plugin.registry.HealthCheckPlugin

# plugin.xml
- zip 파일 생성을 위해 사용 합니다.

