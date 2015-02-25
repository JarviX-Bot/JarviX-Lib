package jarvix.lib.irc;

public enum IRCColors {

	WHITE("white"),
	BLACK("black"),
	DARK_BLUE("darkBlue"),
	DARK_GREEN("darkGreen"),
	RED("red"),
	BROWN("brown"),
	PURPLE("purple"),
	ORANGE("orange"),
	YELLOW("yellow"),
	GREEN("green"),
	TEAL("teal"),
	CYAN("cyan"),
	BLUE("blue"),
	MAGENTA("magenta"),
	DARK_GREY("darkGrey"),
	LIGHT_GREY("lightGrey");

	private final String name;

	private IRCColors(String name) {
		this.name = name;
	}
}
