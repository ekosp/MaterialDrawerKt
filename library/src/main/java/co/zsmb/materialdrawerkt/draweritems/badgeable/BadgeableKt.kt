package co.zsmb.materialdrawerkt.draweritems.badgeable

import com.mikepenz.materialdrawer.holder.BadgeStyle
import com.mikepenz.materialdrawer.holder.StringHolder

interface BadgeableKt {

    /**
     * The text of the displayed badge given by a String resource.
     *
     * Wraps the withBadge function. Non readable property.
     */
    var badgeRes: Int

    /**
     * The text of the displayed badge given by a StringHolder.
     *
     * Wraps the withBadge function. Non readable property.
     */
    @Deprecated(level = DeprecationLevel.WARNING,
            message = "This property is for internal use. Use the badgeRes property or the badge method instead.")
    var badgeHolder: StringHolder

    /**
     * The style of the displayed badge given by a BadgeStyle.
     *
     * Wraps the withBadgeStyle function. Non readable property.
     */
    var badgeStyle: BadgeStyle

}
