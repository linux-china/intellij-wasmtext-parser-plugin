// This is a generated file. Not intended for manual editing.
package com.wasmplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.wasmplugin.psi.WasmTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WasmParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  /* ********************************************************** */
  // param_list? result?
  public static boolean abbr_type_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_type_use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_TYPE_USE, "<abbr type use>");
    r = abbr_type_use_0(b, l + 1);
    r = r && abbr_type_use_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_list?
  private static boolean abbr_type_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_type_use_0")) return false;
    param_list(b, l + 1);
    return true;
  }

  // result?
  private static boolean abbr_type_use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_type_use_1")) return false;
    result(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tALIGN tEQ tINT
  public static boolean align_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "align_arg")) return false;
    if (!nextTokenIs(b, TALIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TALIGN, TEQ, TINT);
    exit_section_(b, m, ALIGN_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // tBLOCK tID? result? instruction* tEND tID?
  //                     |   tLOOP tID? result? instruction* tEND tID?
  //                     |   tIF tID? result? instruction* else_clause? tEND tID?
  static boolean block_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_instruction_0(b, l + 1);
    if (!r) r = block_instruction_1(b, l + 1);
    if (!r) r = block_instruction_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tBLOCK tID? result? instruction* tEND tID?
  private static boolean block_instruction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBLOCK);
    r = r && block_instruction_0_1(b, l + 1);
    r = r && block_instruction_0_2(b, l + 1);
    r = r && block_instruction_0_3(b, l + 1);
    r = r && consumeToken(b, TEND);
    r = r && block_instruction_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean block_instruction_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean block_instruction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_2")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean block_instruction_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_instruction_0_3", c)) break;
    }
    return true;
  }

  // tID?
  private static boolean block_instruction_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_5")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLOOP tID? result? instruction* tEND tID?
  private static boolean block_instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLOOP);
    r = r && block_instruction_1_1(b, l + 1);
    r = r && block_instruction_1_2(b, l + 1);
    r = r && block_instruction_1_3(b, l + 1);
    r = r && consumeToken(b, TEND);
    r = r && block_instruction_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean block_instruction_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean block_instruction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_2")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean block_instruction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_instruction_1_3", c)) break;
    }
    return true;
  }

  // tID?
  private static boolean block_instruction_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_5")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tIF tID? result? instruction* else_clause? tEND tID?
  private static boolean block_instruction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TIF);
    r = r && block_instruction_2_1(b, l + 1);
    r = r && block_instruction_2_2(b, l + 1);
    r = r && block_instruction_2_3(b, l + 1);
    r = r && block_instruction_2_4(b, l + 1);
    r = r && consumeToken(b, TEND);
    r = r && block_instruction_2_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean block_instruction_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean block_instruction_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_2")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean block_instruction_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_instruction_2_3", c)) break;
    }
    return true;
  }

  // else_clause?
  private static boolean block_instruction_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_4")) return false;
    else_clause(b, l + 1);
    return true;
  }

  // tID?
  private static boolean block_instruction_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_6")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT | LINE_COMMENT
  public static boolean com(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "com")) return false;
    if (!nextTokenIs(b, "<com>", BLOCK_COMMENT, LINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COM, "<com>");
    r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tLP tDATA idx? offset_abbrv tNAME tRP
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TDATA);
    r = r && data_2(b, l + 1);
    r = r && offset_abbrv(b, l + 1);
    r = r && consumeTokens(b, 0, TNAME, TRP);
    exit_section_(b, m, DATA, r);
    return r;
  }

  // idx?
  private static boolean data_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_2")) return false;
    idx(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tLP tDATA tNAME tRP
  public static boolean data_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TDATA, TNAME, TRP);
    exit_section_(b, m, DATA_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tELEM idx* tRP
  public static boolean elem_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TELEM);
    r = r && elem_short_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, ELEM_SHORT, r);
    return r;
  }

  // idx*
  private static boolean elem_short_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_short_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!idx(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elem_short_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tANYFUNC | tFUNCREF
  public static boolean elem_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_type")) return false;
    if (!nextTokenIs(b, "<elem type>", TANYFUNC, TFUNCREF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEM_TYPE, "<elem type>");
    r = consumeToken(b, TANYFUNC);
    if (!r) r = consumeToken(b, TFUNCREF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tLP tELEM idx? offset_abbrv idx*  tRP
  public static boolean element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TELEM);
    r = r && element_2(b, l + 1);
    r = r && offset_abbrv(b, l + 1);
    r = r && element_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, ELEMENT, r);
    return r;
  }

  // idx?
  private static boolean element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_2")) return false;
    idx(b, l + 1);
    return true;
  }

  // idx*
  private static boolean element_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!idx(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tELSE tID? instruction*
  static boolean else_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause")) return false;
    if (!nextTokenIs(b, TELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TELSE);
    r = r && else_clause_1(b, l + 1);
    r = r && else_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean else_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // instruction*
  private static boolean else_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_clause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tLP tTHEN instruction* tRP
  static boolean else_clause_folded(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_folded")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTHEN);
    r = r && else_clause_folded_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // instruction*
  private static boolean else_clause_folded_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_folded_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_clause_folded_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tLP tEXPORT tNAME export_desc tRP
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TEXPORT, TNAME);
    r = r && export_desc(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, EXPORT, r);
    return r;
  }

  /* ********************************************************** */
  // tLP (tFUNC|tMEMORY|tTABLE|tGLOBAL) idx tRP
  public static boolean export_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_desc")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLP);
    r = r && export_desc_1(b, l + 1);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, EXPORT_DESC, r);
    return r;
  }

  // tFUNC|tMEMORY|tTABLE|tGLOBAL
  private static boolean export_desc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_desc_1")) return false;
    boolean r;
    r = consumeToken(b, TFUNC);
    if (!r) r = consumeToken(b, TMEMORY);
    if (!r) r = consumeToken(b, TTABLE);
    if (!r) r = consumeToken(b, TGLOBAL);
    return r;
  }

  /* ********************************************************** */
  // tLP tEXPORT tNAME tRP
  public static boolean export_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TEXPORT, TNAME, TRP);
    exit_section_(b, m, EXPORT_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // instruction*
  static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tLP plain_instruction folded_instruction* tRP
  //                     |   tLP tBLOCK tID? result? instruction* tRP
  //                     |   tLP tLOOP tID? result? instruction* tRP
  //                     |   tLP tIF tID? result? folded_instruction* tLP tTHEN instruction* tRP else_clause_folded? tRP
  static boolean folded_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = folded_instruction_0(b, l + 1);
    if (!r) r = folded_instruction_1(b, l + 1);
    if (!r) r = folded_instruction_2(b, l + 1);
    if (!r) r = folded_instruction_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tLP plain_instruction folded_instruction* tRP
  private static boolean folded_instruction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLP);
    r = r && plain_instruction(b, l + 1);
    r = r && folded_instruction_0_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // folded_instruction*
  private static boolean folded_instruction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!folded_instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_0_2", c)) break;
    }
    return true;
  }

  // tLP tBLOCK tID? result? instruction* tRP
  private static boolean folded_instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TBLOCK);
    r = r && folded_instruction_1_2(b, l + 1);
    r = r && folded_instruction_1_3(b, l + 1);
    r = r && folded_instruction_1_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean folded_instruction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean folded_instruction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1_3")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean folded_instruction_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_1_4", c)) break;
    }
    return true;
  }

  // tLP tLOOP tID? result? instruction* tRP
  private static boolean folded_instruction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TLOOP);
    r = r && folded_instruction_2_2(b, l + 1);
    r = r && folded_instruction_2_3(b, l + 1);
    r = r && folded_instruction_2_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean folded_instruction_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean folded_instruction_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2_3")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean folded_instruction_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_2_4", c)) break;
    }
    return true;
  }

  // tLP tIF tID? result? folded_instruction* tLP tTHEN instruction* tRP else_clause_folded? tRP
  private static boolean folded_instruction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TIF);
    r = r && folded_instruction_3_2(b, l + 1);
    r = r && folded_instruction_3_3(b, l + 1);
    r = r && folded_instruction_3_4(b, l + 1);
    r = r && consumeTokens(b, 0, TLP, TTHEN);
    r = r && folded_instruction_3_7(b, l + 1);
    r = r && consumeToken(b, TRP);
    r = r && folded_instruction_3_9(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean folded_instruction_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean folded_instruction_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_3")) return false;
    result(b, l + 1);
    return true;
  }

  // folded_instruction*
  private static boolean folded_instruction_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!folded_instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_3_4", c)) break;
    }
    return true;
  }

  // instruction*
  private static boolean folded_instruction_3_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_3_7", c)) break;
    }
    return true;
  }

  // else_clause_folded?
  private static boolean folded_instruction_3_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_9")) return false;
    else_clause_folded(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tLP tFUNC tID? type_use local* expression tRP
  public static boolean func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && func_2(b, l + 1);
    r = r && type_use(b, l + 1);
    r = r && func_4(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, FUNC, r);
    return r;
  }

  // tID?
  private static boolean func_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // local*
  private static boolean func_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!local(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tLP tFUNC param_list? result? tRP
  public static boolean func_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && func_type_2(b, l + 1);
    r = r && func_type_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, FUNC_TYPE, r);
    return r;
  }

  // param_list?
  private static boolean func_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_2")) return false;
    param_list(b, l + 1);
    return true;
  }

  // result?
  private static boolean func_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_3")) return false;
    result(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tLP tGLOBAL tID? global_type  tLP instruction tRP tRP
  //         | tLP tGLOBAL tID? import_short global_type tRP
  //         | tLP tGLOBAL tID? export_short global_type tRP
  public static boolean global(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_0(b, l + 1);
    if (!r) r = global_1(b, l + 1);
    if (!r) r = global_2(b, l + 1);
    exit_section_(b, m, GLOBAL, r);
    return r;
  }

  // tLP tGLOBAL tID? global_type  tLP instruction tRP tRP
  private static boolean global_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_0_2(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TLP);
    r = r && instruction(b, l + 1);
    r = r && consumeTokens(b, 0, TRP, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean global_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tGLOBAL tID? import_short global_type tRP
  private static boolean global_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_1_2(b, l + 1);
    r = r && import_short(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean global_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tGLOBAL tID? export_short global_type tRP
  private static boolean global_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_2_2(b, l + 1);
    r = r && export_short(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean global_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // value_type | tLP tMUT value_type tRP
  public static boolean global_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_TYPE, "<global type>");
    r = value_type(b, l + 1);
    if (!r) r = global_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tLP tMUT value_type tRP
  private static boolean global_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMUT);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tINT | tID
  public static boolean idx(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idx")) return false;
    if (!nextTokenIs(b, "<idx>", TID, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDX, "<idx>");
    r = consumeToken(b, TINT);
    if (!r) r = consumeToken(b, TID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tLP tIMPORT tNAME tNAME import_desc tRP
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TIMPORT, TNAME, TNAME);
    r = r && import_desc(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tFUNC tID? type_use tRP
  //             | tLP tTABLE tID? table_type tRP
  //             | tLP tMEMORY tID? memory_type tRP
  //             | tLP tGLOBAL tID? global_type tRP
  public static boolean import_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_desc_0(b, l + 1);
    if (!r) r = import_desc_1(b, l + 1);
    if (!r) r = import_desc_2(b, l + 1);
    if (!r) r = import_desc_3(b, l + 1);
    exit_section_(b, m, IMPORT_DESC, r);
    return r;
  }

  // tLP tFUNC tID? type_use tRP
  private static boolean import_desc_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && import_desc_0_2(b, l + 1);
    r = r && type_use(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean import_desc_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? table_type tRP
  private static boolean import_desc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && import_desc_1_2(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean import_desc_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? memory_type tRP
  private static boolean import_desc_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && import_desc_2_2(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean import_desc_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tGLOBAL tID? global_type tRP
  private static boolean import_desc_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && import_desc_3_2(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean import_desc_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tIMPORT tNAME tNAME tRP
  public static boolean import_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TIMPORT, TNAME, TNAME, TRP);
    exit_section_(b, m, IMPORT_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // block_instruction | plain_instruction | folded_instruction
  public static boolean instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTRUCTION, "<instruction>");
    r = block_instruction(b, l + 1);
    if (!r) r = plain_instruction(b, l + 1);
    if (!r) r = folded_instruction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tINT tINT | tINT
  public static boolean limits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limits")) return false;
    if (!nextTokenIs(b, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, TINT, TINT);
    if (!r) r = consumeToken(b, TINT);
    exit_section_(b, m, LIMITS, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tLOCAL  tID? value_type tRP
  //         | local_abbr
  public static boolean local(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_0(b, l + 1);
    if (!r) r = local_abbr(b, l + 1);
    exit_section_(b, m, LOCAL, r);
    return r;
  }

  // tLP tLOCAL  tID? value_type tRP
  private static boolean local_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TLOCAL);
    r = r && local_0_2(b, l + 1);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean local_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tLOCAL value_type* tRP
  public static boolean local_abbr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_abbr")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TLOCAL);
    r = r && local_abbr_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, LOCAL_ABBR, r);
    return r;
  }

  // value_type*
  private static boolean local_abbr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_abbr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "local_abbr_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // offset_arg? align_arg?
  public static boolean mem_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mem_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEM_ARG, "<mem arg>");
    r = mem_arg_0(b, l + 1);
    r = r && mem_arg_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // offset_arg?
  private static boolean mem_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mem_arg_0")) return false;
    offset_arg(b, l + 1);
    return true;
  }

  // align_arg?
  private static boolean mem_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mem_arg_1")) return false;
    align_arg(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tLP tMEMORY tID? memory_type tRP
  //         | tLP tMEMORY tID? data_short tRP
  //         | tLP tMEMORY tID? import_short memory_type tRP
  //         | tLP tMEMORY tID? export_short memory_type tRP
  public static boolean memory(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memory_0(b, l + 1);
    if (!r) r = memory_1(b, l + 1);
    if (!r) r = memory_2(b, l + 1);
    if (!r) r = memory_3(b, l + 1);
    exit_section_(b, m, MEMORY, r);
    return r;
  }

  // tLP tMEMORY tID? memory_type tRP
  private static boolean memory_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_0_2(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? data_short tRP
  private static boolean memory_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_1_2(b, l + 1);
    r = r && data_short(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? import_short memory_type tRP
  private static boolean memory_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_2_2(b, l + 1);
    r = r && import_short(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? export_short memory_type tRP
  private static boolean memory_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_3_2(b, l + 1);
    r = r && export_short(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // limits
  public static boolean memory_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_type")) return false;
    if (!nextTokenIs(b, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = limits(b, l + 1);
    exit_section_(b, m, MEMORY_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tMODULE tID? module_field*  tRP | module_field*
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0(b, l + 1);
    if (!r) r = module_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tLP tMODULE tID? module_field*  tRP
  private static boolean module_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMODULE);
    r = r && module_0_2(b, l + 1);
    r = r && module_0_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean module_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // module_field*
  private static boolean module_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_0_3", c)) break;
    }
    return true;
  }

  // module_field*
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type
  //                              | import
  //                              | table
  //                              | memory
  //                              | global
  //                              | export
  //                              | element
  //                              | data
  //                              | start
  //                              | func
  static boolean module_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_field")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = import_$(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = memory(b, l + 1);
    if (!r) r = global(b, l + 1);
    if (!r) r = export(b, l + 1);
    if (!r) r = element(b, l + 1);
    if (!r) r = data(b, l + 1);
    if (!r) r = start(b, l + 1);
    if (!r) r = func(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // tFLOAT | tINT
  public static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    if (!nextTokenIs(b, "<num>", TFLOAT, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUM, "<num>");
    r = consumeToken(b, TFLOAT);
    if (!r) r = consumeToken(b, TINT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tLP tOFFSET? instruction tRP
  public static boolean offset_abbrv(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_abbrv")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLP);
    r = r && offset_abbrv_1(b, l + 1);
    r = r && instruction(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, OFFSET_ABBRV, r);
    return r;
  }

  // tOFFSET?
  private static boolean offset_abbrv_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_abbrv_1")) return false;
    consumeToken(b, TOFFSET);
    return true;
  }

  /* ********************************************************** */
  // tOFFSET tEQ tINT
  public static boolean offset_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_arg")) return false;
    if (!nextTokenIs(b, TOFFSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TOFFSET, TEQ, TINT);
    exit_section_(b, m, OFFSET_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tPARAM tID? value_type tRP
  public static boolean param_explicit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_explicit")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TPARAM);
    r = r && param_explicit_2(b, l + 1);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, PARAM_EXPLICIT, r);
    return r;
  }

  // tID?
  private static boolean param_explicit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_explicit_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tPARAM value_type value_type+ tRP
  //               |param_explicit+
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_list_0(b, l + 1);
    if (!r) r = param_list_1(b, l + 1);
    exit_section_(b, m, PARAM_LIST, r);
    return r;
  }

  // tLP tPARAM value_type value_type+ tRP
  private static boolean param_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TPARAM);
    r = r && value_type(b, l + 1);
    r = r && param_list_0_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // value_type+
  private static boolean param_list_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_type(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "param_list_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // param_explicit+
  private static boolean param_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_explicit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!param_explicit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "param_list_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tUNREACHABLE
  //                     |   tNOP
  //                     |   tBR idx
  //                     |   tBR_IF idx
  //                     |   tBR_TABLE idx+
  //                     |   tRETURN
  //                     |   tCALL idx
  //                     |   tCALL_INDIRECT type_use // TODO(dherre3): Verify that not identifier is bound to the parameters.
  //                     // Parametric Instructions
  //                     |   tDROP
  //                     |   tSELECT
  //                     |   tGET_LOCAL idx
  //                     |   tSET_LOCAL idx
  //                     |   tGET_GLOBAL idx
  //                     |   tSET_GLOBAL idx
  //                     |   tTEE_LOCAL idx
  //                     |   TLOCAL tDOT TGET idx
  //                     |   TLOCAL tDOT TSET idx
  //                     |   TLOCAL tDOT TTEE idx
  //                     |   TGLOBAL tDOT TGET idx
  //                     |   TGLOBAL tDOT TSET idx
  //                     // Memory Instructions
  //                     |   tI32 tDOT tLOAD mem_arg
  //                     |   tI64 tDOT tLOAD mem_arg
  //                     |   tF32 tDOT tLOAD mem_arg
  //                     |   tF64 tDOT tLOAD mem_arg
  //                     |   tI32 tDOT tLOAD8_S mem_arg
  //                     |   tI32 tDOT tLOAD8_U mem_arg
  //                     |   tI32 tDOT tLOAD16_S mem_arg
  //                     |   tI32 tDOT tLOAD16_U mem_arg
  //                     |   tI64 tDOT tLOAD8_S mem_arg
  //                     |   tI64 tDOT tLOAD8_U mem_arg
  //                     |   tI64 tDOT tLOAD16_S mem_arg
  //                     |   tI64 tDOT tLOAD16_U mem_arg
  //                     |   tI64 tDOT tLOAD32_S mem_arg
  //                     |   tI64 tDOT tLOAD32_U mem_arg
  //                     |   tI32 tDOT tSTORE mem_arg
  //                     |   tI64 tDOT tSTORE mem_arg
  //                     |   tF32 tDOT tSTORE mem_arg
  //                     |   tF64 tDOT tSTORE mem_arg
  //                     |   tI32 tDOT tSTORE8 mem_arg
  //                     |   tI32 tDOT tSTORE16 mem_arg
  //                     |   tI64 tDOT tSTORE8 mem_arg
  //                     |   tI64 tDOT tSTORE16 mem_arg
  //                     |   tI64 tDOT tSTORE32 mem_arg
  //                     |   tMEMORY tDOT tSIZE
  //                     |   tMEMORY tDOT tGROW
  //                     //      Numeric instructions
  //                     // const
  //                     |   tI32 tDOT tCONST tINT
  //                     |   tI64 tDOT tCONST tINT
  //                     |   tF32 tDOT tCONST num
  //                     |   tF64 tDOT tCONST num
  //                     // i32 ops
  //                     |   tI32 tDOT tCLZ
  //                     |   tI32 tDOT tCTZ
  //                     |   tI32 tDOT tPOPCNT
  //                     |   tI32 tDOT tADD
  //                     |   tI32 tDOT tMUL
  //                     |   tI32 tDOT tSUB
  //                     |   tI32 tDOT tDIV_S
  //                     |   tI32 tDOT tDIV_U
  //                     |   tI32 tDOT tREM_S
  //                     |   tI32 tDOT tREM_U
  //                     |   tI32 tDOT tAND
  //                     |   tI32 tDOT tOR
  //                     |   tI32 tDOT tXOR
  //                     |   tI32 tDOT tSHL
  //                     |   tI32 tDOT tSHR_S
  //                     |   tI32 tDOT tSHR_U
  //                     |   tI32 tDOT tROTL
  //                     |   tI32 tDOT tROTR
  //                     // i64 ops
  //                     |   tI64 tDOT tCLZ
  //                     |   tI64 tDOT tCTZ
  //                     |   tI64 tDOT tPOPCNT
  //                     |   tI64 tDOT tADD
  //                     |   tI64 tDOT tMUL
  //                     |   tI64 tDOT tSUB
  //                     |   tI64 tDOT tDIV_S
  //                     |   tI64 tDOT tDIV_U
  //                     |   tI64 tDOT tREM_S
  //                     |   tI64 tDOT tREM_U
  //                     |   tI64 tDOT tAND
  //                     |   tI64 tDOT tOR
  //                     |   tI64 tDOT tXOR
  //                     |   tI64 tDOT tSHL
  //                     |   tI64 tDOT tSHR_S
  //                     |   tI64 tDOT tSHR_U
  //                     |   tI64 tDOT tROTL
  //                     |   tI64 tDOT tROTR
  //                     // f32 opts
  //                     |   tF32 tDOT tABS
  //                     |   tF32 tDOT tNEG
  //                     |   tF32 tDOT tCEIL
  //                     |   tF32 tDOT tFLOOR
  //                     |   tF32 tDOT tTRUNC
  //                     |   tF32 tDOT tNEAREST
  //                     |   tF32 tDOT tSQRT
  //                     |   tF32 tDOT tADD
  //                     |   tF32 tDOT tSUB
  //                     |   tF32 tDOT tMUL
  //                     |   tF32 tDOT tDIV
  //                     |   tF32 tDOT tMIN
  //                     |   tF32 tDOT tMAX
  //                     |   tF32 tDOT tCOPYSIGN
  //                     // f64.opts
  //                     |   tF64 tDOT tABS
  //                     |   tF64 tDOT tNEG
  //                     |   tF64 tDOT tCEIL
  //                     |   tF64 tDOT tFLOOR
  //                     |   tF64 tDOT tTRUNC
  //                     |   tF64 tDOT tNEAREST
  //                     |   tF64 tDOT tSQRT
  //                     |   tF64 tDOT tADD
  //                     |   tF64 tDOT tSUB
  //                     |   tF64 tDOT tMUL
  //                     |   tF64 tDOT tDIV
  //                     |   tF64 tDOT tMIN
  //                     |   tF64 tDOT tMAX
  //                     |   tF64 tDOT tCOPYSIGN
  //                     //
  //                     |   tI32 tDOT tEQZ
  //                     |   tI32 tDOT tEQ
  //                     |   tI32 tDOT tNE
  //                     |   tI32 tDOT tLT_S
  //                     |   tI32 tDOT tLT_U
  //                     |   tI32 tDOT tGT_S
  //                     |   tI32 tDOT tGT_U
  //                     |   tI32 tDOT tLE_S
  //                     |   tI32 tDOT tLE_U
  //                     |   tI32 tDOT tGE_S
  //                     |   tI32 tDOT tGE_U
  //                     //
  //                     |   tI64 tDOT tEQZ
  //                     |   tI64 tDOT tEQ
  //                     |   tI64 tDOT tNE
  //                     |   tI64 tDOT tLT_S
  //                     |   tI64 tDOT tLT_U
  //                     |   tI64 tDOT tGT_S
  //                     |   tI64 tDOT tGT_U
  //                     |   tI64 tDOT tLE_U
  //                     |   tI64 tDOT tLE_S
  //                     |   tI64 tDOT tGE_S
  //                     |   tI64 tDOT tGE_U
  //                     //
  //                     |   tF32 tDOT tEQ
  //                     |   tF32 tDOT tNE
  //                     |   tF32 tDOT tLT
  //                     |   tF32 tDOT tGT
  //                     |   tF32 tDOT tLE
  //                     |   tF32 tDOT tGE
  //                     //
  //                     |   tF64 tDOT tEQ
  //                     |   tF64 tDOT tNE
  //                     |   tF64 tDOT tLT
  //                     |   tF64 tDOT tGT
  //                     |   tF64 tDOT tLE
  //                     |   tF64 tDOT tGE
  //                     //
  //                     |   tI32 tDOT tWRAP_I64
  //                     |   tI32 tDOT tTRUNC_S_F32
  //                     |   tI32 tDOT tTRUNC_U_F32
  //                     |   tI32 tDOT tTRUNC_S_F64
  //                     |   tI32 tDOT tTRUNC_U_F64
  //                     |   tI64 tDOT tEXTEND_S_I32
  //                     |   tI64 tDOT tEXTEND_U_I32
  //                     |   tI64 tDOT tTRUNC_S_F32
  //                     |   tI64 tDOT tTRUNC_U_F32
  //                     |   tI64 tDOT tTRUNC_S_F64
  //                     |   tI64 tDOT tTRUNC_U_F64
  //                     |   tF32 tDOT tCONVERT_S_I32
  //                     |   tF32 tDOT tCONVERT_U_I32
  //                     |   tF32 tDOT tCONVERT_S_I64
  //                     |   tF32 tDOT tCONVERT_U_I64
  //                     |   tF32 tDOT tDEMOTE_F64
  //                     |   tF64 tDOT tCONVERT_S_I32
  //                     |   tF64 tDOT tCONVERT_U_I32
  //                     |   tF64 tDOT tCONVERT_S_I64
  //                     |   tF64 tDOT tCONVERT_U_I64
  //                     |   tF64 tDOT tPROMOTE_F32
  //                     |   tI32 tDOT tREINTERPRET_F32
  //                     |   tI64 tDOT tREINTERPRET_F64
  //                     |   tF32 tDOT tREINTERPRET_I32
  //                     |   tF64 tDOT tREINTERPRET_I64
  static boolean plain_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TUNREACHABLE);
    if (!r) r = consumeToken(b, TNOP);
    if (!r) r = plain_instruction_2(b, l + 1);
    if (!r) r = plain_instruction_3(b, l + 1);
    if (!r) r = plain_instruction_4(b, l + 1);
    if (!r) r = consumeToken(b, TRETURN);
    if (!r) r = plain_instruction_6(b, l + 1);
    if (!r) r = plain_instruction_7(b, l + 1);
    if (!r) r = consumeToken(b, TDROP);
    if (!r) r = consumeToken(b, TSELECT);
    if (!r) r = plain_instruction_10(b, l + 1);
    if (!r) r = plain_instruction_11(b, l + 1);
    if (!r) r = plain_instruction_12(b, l + 1);
    if (!r) r = plain_instruction_13(b, l + 1);
    if (!r) r = plain_instruction_14(b, l + 1);
    if (!r) r = plain_instruction_15(b, l + 1);
    if (!r) r = plain_instruction_16(b, l + 1);
    if (!r) r = plain_instruction_17(b, l + 1);
    if (!r) r = plain_instruction_18(b, l + 1);
    if (!r) r = plain_instruction_19(b, l + 1);
    if (!r) r = plain_instruction_20(b, l + 1);
    if (!r) r = plain_instruction_21(b, l + 1);
    if (!r) r = plain_instruction_22(b, l + 1);
    if (!r) r = plain_instruction_23(b, l + 1);
    if (!r) r = plain_instruction_24(b, l + 1);
    if (!r) r = plain_instruction_25(b, l + 1);
    if (!r) r = plain_instruction_26(b, l + 1);
    if (!r) r = plain_instruction_27(b, l + 1);
    if (!r) r = plain_instruction_28(b, l + 1);
    if (!r) r = plain_instruction_29(b, l + 1);
    if (!r) r = plain_instruction_30(b, l + 1);
    if (!r) r = plain_instruction_31(b, l + 1);
    if (!r) r = plain_instruction_32(b, l + 1);
    if (!r) r = plain_instruction_33(b, l + 1);
    if (!r) r = plain_instruction_34(b, l + 1);
    if (!r) r = plain_instruction_35(b, l + 1);
    if (!r) r = plain_instruction_36(b, l + 1);
    if (!r) r = plain_instruction_37(b, l + 1);
    if (!r) r = plain_instruction_38(b, l + 1);
    if (!r) r = plain_instruction_39(b, l + 1);
    if (!r) r = plain_instruction_40(b, l + 1);
    if (!r) r = plain_instruction_41(b, l + 1);
    if (!r) r = plain_instruction_42(b, l + 1);
    if (!r) r = parseTokens(b, 0, TMEMORY, TDOT, TSIZE);
    if (!r) r = parseTokens(b, 0, TMEMORY, TDOT, TGROW);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TCONST, TINT);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TCONST, TINT);
    if (!r) r = plain_instruction_47(b, l + 1);
    if (!r) r = plain_instruction_48(b, l + 1);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TCLZ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TCTZ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TPOPCNT);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TDIV_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TDIV_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TREM_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TREM_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TAND);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TOR);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TXOR);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSHL);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSHR_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSHR_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TROTL);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TROTR);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TCLZ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TCTZ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TPOPCNT);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TDIV_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TDIV_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TREM_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TREM_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TAND);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TOR);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TXOR);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSHL);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSHR_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSHR_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TROTL);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TROTR);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TABS);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TNEG);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCEIL);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TFLOOR);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TTRUNC);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TNEAREST);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TSQRT);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TDIV);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TMIN);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TMAX);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCOPYSIGN);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TABS);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TNEG);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCEIL);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TFLOOR);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TTRUNC);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TNEAREST);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TSQRT);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TDIV);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TMIN);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TMAX);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCOPYSIGN);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TEQZ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLT_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLT_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGT_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGT_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLE_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLE_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGE_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGE_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEQZ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLT_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLT_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGT_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGT_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLE_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLE_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGE_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGE_U);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TLT);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TGT);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TLE);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TGE);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TLT);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TGT);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TLE);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TGE);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TWRAP_I64);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_S_F32);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_U_F32);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_S_F64);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_U_F64);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND_S_I32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND_U_I32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_S_F32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_U_F32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_S_F64);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_U_F64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_S_I32);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_U_I32);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_S_I64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_U_I64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TDEMOTE_F64);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_S_I32);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_U_I32);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_S_I64);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_U_I64);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TPROMOTE_F32);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TREINTERPRET_F32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TREINTERPRET_F64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TREINTERPRET_I32);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TREINTERPRET_I64);
    exit_section_(b, m, null, r);
    return r;
  }

  // tBR idx
  private static boolean plain_instruction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBR);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tBR_IF idx
  private static boolean plain_instruction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBR_IF);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tBR_TABLE idx+
  private static boolean plain_instruction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBR_TABLE);
    r = r && plain_instruction_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // idx+
  private static boolean plain_instruction_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = idx(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!idx(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plain_instruction_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // tCALL idx
  private static boolean plain_instruction_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TCALL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tCALL_INDIRECT type_use
  private static boolean plain_instruction_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TCALL_INDIRECT);
    r = r && type_use(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tGET_LOCAL idx
  private static boolean plain_instruction_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TGET_LOCAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tSET_LOCAL idx
  private static boolean plain_instruction_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TSET_LOCAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tGET_GLOBAL idx
  private static boolean plain_instruction_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TGET_GLOBAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tSET_GLOBAL idx
  private static boolean plain_instruction_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TSET_GLOBAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tTEE_LOCAL idx
  private static boolean plain_instruction_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTEE_LOCAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TLOCAL tDOT TGET idx
  private static boolean plain_instruction_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLOCAL, TDOT, TGET);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TLOCAL tDOT TSET idx
  private static boolean plain_instruction_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLOCAL, TDOT, TSET);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TLOCAL tDOT TTEE idx
  private static boolean plain_instruction_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLOCAL, TDOT, TTEE);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TGLOBAL tDOT TGET idx
  private static boolean plain_instruction_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TGLOBAL, TDOT, TGET);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TGLOBAL tDOT TSET idx
  private static boolean plain_instruction_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TGLOBAL, TDOT, TSET);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tLOAD mem_arg
  private static boolean plain_instruction_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD mem_arg
  private static boolean plain_instruction_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_21")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tF32 tDOT tLOAD mem_arg
  private static boolean plain_instruction_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_22")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF32, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tF64 tDOT tLOAD mem_arg
  private static boolean plain_instruction_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_23")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF64, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tLOAD8_S mem_arg
  private static boolean plain_instruction_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_24")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD8_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tLOAD8_U mem_arg
  private static boolean plain_instruction_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_25")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD8_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tLOAD16_S mem_arg
  private static boolean plain_instruction_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_26")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD16_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tLOAD16_U mem_arg
  private static boolean plain_instruction_27(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_27")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD16_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD8_S mem_arg
  private static boolean plain_instruction_28(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_28")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD8_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD8_U mem_arg
  private static boolean plain_instruction_29(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_29")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD8_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD16_S mem_arg
  private static boolean plain_instruction_30(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_30")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD16_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD16_U mem_arg
  private static boolean plain_instruction_31(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_31")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD16_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD32_S mem_arg
  private static boolean plain_instruction_32(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_32")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD32_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tLOAD32_U mem_arg
  private static boolean plain_instruction_33(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_33")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD32_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tSTORE mem_arg
  private static boolean plain_instruction_34(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_34")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tSTORE mem_arg
  private static boolean plain_instruction_35(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_35")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tF32 tDOT tSTORE mem_arg
  private static boolean plain_instruction_36(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_36")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF32, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tF64 tDOT tSTORE mem_arg
  private static boolean plain_instruction_37(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_37")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF64, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tSTORE8 mem_arg
  private static boolean plain_instruction_38(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_38")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TSTORE8);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI32 tDOT tSTORE16 mem_arg
  private static boolean plain_instruction_39(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_39")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TSTORE16);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tSTORE8 mem_arg
  private static boolean plain_instruction_40(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_40")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE8);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tSTORE16 mem_arg
  private static boolean plain_instruction_41(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_41")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE16);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tI64 tDOT tSTORE32 mem_arg
  private static boolean plain_instruction_42(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_42")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE32);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tF32 tDOT tCONST num
  private static boolean plain_instruction_47(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_47")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF32, TDOT, TCONST);
    r = r && num(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tF64 tDOT tCONST num
  private static boolean plain_instruction_48(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_48")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF64, TDOT, TCONST);
    r = r && num(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tRESULT  value_type value_type+ tRP
  //         | result_explicit+
  public static boolean result(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = result_0(b, l + 1);
    if (!r) r = result_1(b, l + 1);
    exit_section_(b, m, RESULT, r);
    return r;
  }

  // tLP tRESULT  value_type value_type+ tRP
  private static boolean result_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TRESULT);
    r = r && value_type(b, l + 1);
    r = r && result_0_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // value_type+
  private static boolean result_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_type(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "result_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // result_explicit+
  private static boolean result_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = result_explicit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!result_explicit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "result_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tRESULT value_type tRP
  public static boolean result_explicit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_explicit")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TRESULT);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, RESULT_EXPLICIT, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tSTART idx tRP
  public static boolean start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "start")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TSTART);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, START, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tTABLE tID? table_type tRP
  //         | tLP tTABLE tID? elem_type elem_short tRP
  //         | tLP tTABLE tID? import_short table_type tRP
  //         | tLP tTABLE tID? export_short table_type tRP
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_0(b, l + 1);
    if (!r) r = table_1(b, l + 1);
    if (!r) r = table_2(b, l + 1);
    if (!r) r = table_3(b, l + 1);
    exit_section_(b, m, TABLE, r);
    return r;
  }

  // tLP tTABLE tID? table_type tRP
  private static boolean table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_0_2(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean table_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? elem_type elem_short tRP
  private static boolean table_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_1_2(b, l + 1);
    r = r && elem_type(b, l + 1);
    r = r && elem_short(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean table_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? import_short table_type tRP
  private static boolean table_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_2_2(b, l + 1);
    r = r && import_short(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean table_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? export_short table_type tRP
  private static boolean table_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_3_2(b, l + 1);
    r = r && export_short(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean table_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // limits elem_type
  public static boolean table_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_type")) return false;
    if (!nextTokenIs(b, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = limits(b, l + 1);
    r = r && elem_type(b, l + 1);
    exit_section_(b, m, TABLE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tTYPE tID? func_type tRP
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTYPE);
    r = r && type_2(b, l + 1);
    r = r && func_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // tID?
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tTYPE idx tRP abbr_type_use
  //         |   abbr_type_use
  public static boolean type_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_USE, "<type use>");
    r = type_use_0(b, l + 1);
    if (!r) r = abbr_type_use(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tLP tTYPE idx tRP abbr_type_use
  private static boolean type_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_use_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTYPE);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    r = r && abbr_type_use(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tI32|tF64|tF32|tI64
  public static boolean value_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPE, "<value type>");
    r = consumeToken(b, TI32);
    if (!r) r = consumeToken(b, TF64);
    if (!r) r = consumeToken(b, TF32);
    if (!r) r = consumeToken(b, TI64);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
