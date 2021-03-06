// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.wasmplugin.psi.WasmTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.wasmplugin.psi.*;

public class WasmGlobalImpl extends ASTWrapperPsiElement implements WasmGlobal {

  public WasmGlobalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitGlobal(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WasmExportShort getExportShort() {
    return findChildByClass(WasmExportShort.class);
  }

  @Override
  @NotNull
  public WasmGlobalType getGlobalType() {
    return findNotNullChildByClass(WasmGlobalType.class);
  }

  @Override
  @Nullable
  public WasmImportShort getImportShort() {
    return findChildByClass(WasmImportShort.class);
  }

  @Override
  @Nullable
  public WasmInstruction getInstruction() {
    return findChildByClass(WasmInstruction.class);
  }

}
