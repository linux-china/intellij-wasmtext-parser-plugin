// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmParamList extends PsiElement {

  @NotNull
  List<WasmParamExplicit> getParamExplicitList();

  @NotNull
  List<WasmValueType> getValueTypeList();

}
