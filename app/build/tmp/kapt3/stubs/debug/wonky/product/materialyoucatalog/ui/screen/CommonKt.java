package wonky.product.materialyoucatalog.ui.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a7\u0010\b\u001a\u00020\u00012(\u0010\t\u001a\u0015\u0012\u0011\b\u0001\u0012\r\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0002\b\f0\n\"\r\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0002\b\fH\u0007\u00a2\u0006\u0002\u0010\r\u001a*\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\b\u0010\u0014\u001a\u00020\u0001H\u0007\u001aA\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a4\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u001b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0007\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0007H\u0007\u001a\u001b\u0010!\u001a\u00020\u00012\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0002\b\fH\u0007\u001a6\u0010\"\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00072\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0002\b\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0002\b\fH\u0007\u001a\b\u0010%\u001a\u00020\u0010H\u0007\u001a\b\u0010&\u001a\u00020\u0010H\u0007\u001a\b\u0010\'\u001a\u00020\u0010H\u0007\u001a\b\u0010(\u001a\u00020\u0010H\u0007\u001a\u0010\u0010)\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0007H\u0007\u001a\b\u0010*\u001a\u00020\u0001H\u0007\u001a\b\u0010+\u001a\u00020\u0001H\u0007\u001a\b\u0010,\u001a\u00020\u0001H\u0007\u001a\b\u0010-\u001a\u00020\u0001H\u0007\u001a\b\u0010.\u001a\u00020\u0001H\u0007\u001a\b\u0010/\u001a\u00020\u0001H\u0007\u001a\b\u00100\u001a\u00020\u0001H\u0007\u001a\b\u00101\u001a\u00020\u0001H\u0007\u001a\b\u00102\u001a\u00020\u0001H\u0007\u001a\u001a\u00103\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u001a\u00104\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00065"}, d2 = {"CheckBoxWithText", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "text", "", "ComponentArrangement", "content", "", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "([Lkotlin/jvm/functions/Function0;)V", "DialogCloseButton", "modifier", "Landroidx/compose/ui/Modifier;", "position", "Landroidx/compose/ui/Alignment;", "onClick", "Div6v", "ElevationSelector", "elevation", "Landroidx/compose/ui/unit/Dp;", "onChangeElevation", "ElevationSelector-d8LSEHM", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;FLkotlin/jvm/functions/Function1;)V", "Lwonky/product/materialyoucatalog/ui/screen/ElevationLevel;", "MainMessage", "message", "MainTitle", "title", "MainWarningMessage", "MaterialContents", "MaterialElementScreen", "componentContent", "controlContent", "Padding12h", "Padding16h", "Padding6h", "Padding8h", "SmallText", "Spacer12", "Spacer16v", "Spacer32v", "Spacer4", "Spacer4h", "Spacer6", "Spacer6v", "Spacer8h", "Spacer8v", "SubTitleLarge", "SubTitleSmall", "app_debug"})
public final class CommonKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ComponentArrangement(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit>... content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MaterialContents(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer6() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer6v() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer4() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer4h() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer8h() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer12() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer8v() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer16v() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Spacer32v() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public static final androidx.compose.ui.Modifier Padding6h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public static final androidx.compose.ui.Modifier Padding8h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public static final androidx.compose.ui.Modifier Padding12h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public static final androidx.compose.ui.Modifier Padding16h() {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Div6v() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MainTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SubTitleSmall(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SubTitleLarge(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MainMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MainWarningMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SmallText(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CheckBoxWithText(boolean checked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MaterialElementScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> componentContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> controlContent) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ElevationSelector(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    wonky.product.materialyoucatalog.ui.screen.ElevationLevel elevation, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super wonky.product.materialyoucatalog.ui.screen.ElevationLevel, kotlin.Unit> onChangeElevation) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DialogCloseButton(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Alignment position, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}