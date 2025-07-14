package androidx.constraintlayout.core.parser;

public class CLToken extends CLElement {
    int mIndex = 0;
    char[] mTokenFalse = "false".toCharArray();
    char[] mTokenNull = "null".toCharArray();
    char[] mTokenTrue = "true".toCharArray();
    Type mType = Type.UNKNOWN;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public boolean getBoolean() throws CLParsingException {
        if (this.mType == Type.TRUE) {
            return true;
        }
        if (this.mType == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public boolean isNull() throws CLParsingException {
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    public CLToken(char[] content) {
        super(content);
    }

    public static CLElement allocate(char[] content) {
        return new CLToken(content);
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        if (CLParser.sDebug) {
            return "<" + content() + ">";
        }
        return content();
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder();
        addIndent(json, indent);
        json.append(content());
        return json.toString();
    }

    public Type getType() {
        return this.mType;
    }

    public boolean validate(char c, long position) {
        boolean isValid = false;
        boolean z = false;
        switch (this.mType.ordinal()) {
            case 0:
                if (this.mTokenTrue[this.mIndex] != c) {
                    if (this.mTokenFalse[this.mIndex] != c) {
                        if (this.mTokenNull[this.mIndex] == c) {
                            this.mType = Type.NULL;
                            isValid = true;
                            break;
                        }
                    } else {
                        this.mType = Type.FALSE;
                        isValid = true;
                        break;
                    }
                } else {
                    this.mType = Type.TRUE;
                    isValid = true;
                    break;
                }
                break;
            case 1:
                if (this.mTokenTrue[this.mIndex] == c) {
                    z = true;
                }
                isValid = z;
                if (isValid && this.mIndex + 1 == this.mTokenTrue.length) {
                    setEnd(position);
                    break;
                }
            case 2:
                if (this.mTokenFalse[this.mIndex] == c) {
                    z = true;
                }
                isValid = z;
                if (isValid && this.mIndex + 1 == this.mTokenFalse.length) {
                    setEnd(position);
                    break;
                }
            case 3:
                if (this.mTokenNull[this.mIndex] == c) {
                    z = true;
                }
                isValid = z;
                if (isValid && this.mIndex + 1 == this.mTokenNull.length) {
                    setEnd(position);
                    break;
                }
        }
        this.mIndex++;
        return isValid;
    }
}
