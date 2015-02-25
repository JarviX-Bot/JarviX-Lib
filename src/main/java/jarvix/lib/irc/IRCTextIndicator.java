package jarvix.lib.irc;

public enum IRCTextIndicator {

	BOLD("bold", "\u0002"),
	COLOR("color", "\u0003"),
	RESET("reset", "\u000f"),
	REVERSE("reverse", "\u0016"),
	UNDERLINE("underline", "\u001f");

	private final String name;
	private final String value;

	private IRCTextIndicator(String name, String value) {
		this.name = name;
		this.value = value;
	}
}
