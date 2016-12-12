package com.ericsson.eiffel.remrem.publish.config;

public class PropertiesConfig {
	public static final String MESSAGE_BUS_HOST = "com.ericsson.eiffel.remrem.publish.messagebus.host";
	public static final String MESSAGE_BUS_PORT = "com.ericsson.eiffel.remrem.publish.messagebus.port";
	public static final String TLS = "com.ericsson.eiffel.remrem.publish.messagebus.tls";
	public static final String EXCHANGE_NAME = "com.ericsson.eiffel.remrem.publish.exchange.name";
	public static final String USE_PERSISTENCE = "com.ericsson.eiffel.remrem.publish.use.persistence";
	public static final String CLI_MODE = "com.ericsson.eiffel.remrem.publish.cli.mode";
	public static final String TEST_MODE = "com.ericsson.eiffel.remrem.publish.cli.test.mode";
	
	public static final String INVALID_EVENT_CONTENT = "Invalid event content, client need to fix problem in event before submitting again";
	public static final String INVALID_MESSAGE = "INVALID_MESSAGE";
	public static final String SUCCESS = "SUCCESS";

	public static final String EVENT_ID = "eventId";
	public static final String ID = "id";
	public static final String META = "meta";
	public static final String EIFFEL_MESSAGE_VERSIONS = "eiffelMessageVersions";
}