appender('CONSOLE', ConsoleAppender) {
	encoder(PatternLayoutEncoder) {
		pattern = '%d{yyyy HH:mm:ss} %msg%n'
	}
}
root(INFO, ['CONSOLE'])