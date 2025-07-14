package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@MustBeDocumented
@Target(allowedTargets = {AnnotationTarget.PROPERTY})
@ExperimentalSerializationApi
@Documented
@java.lang.annotation.Target({})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/EncodeDefault;", "", "mode", "Lkotlinx/serialization/EncodeDefault$Mode;", "()Lkotlinx/serialization/EncodeDefault$Mode;", "Mode", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Annotations.kt */
public @interface EncodeDefault {
    Mode mode() default Mode.ALWAYS;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/EncodeDefault$Mode;", "", "(Ljava/lang/String;I)V", "ALWAYS", "NEVER", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalSerializationApi
    /* compiled from: Annotations.kt */
    public enum Mode {
        ALWAYS,
        NEVER;

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        static {
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) (Enum[]) $VALUES);
        }
    }
}
