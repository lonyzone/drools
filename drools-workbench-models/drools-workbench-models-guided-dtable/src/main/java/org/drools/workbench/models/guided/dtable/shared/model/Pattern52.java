/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.models.guided.dtable.shared.model;

import java.util.ArrayList;
import java.util.List;

import org.drools.workbench.models.datamodel.rule.CEPWindow;
import org.drools.workbench.models.datamodel.rule.HasCEPWindow;

/**
 * A Fact Pattern to which column definitions can be added
 */
public class Pattern52
        implements CompositeColumn<ConditionCol52>,
                   HasCEPWindow, DiffColumn {

    // The type of the fact - class - eg Driver, Purchase, Cheese etc.
    private String factType;

    // The name that this gets referenced as. Multiple columns with the same
    // name mean their constraints will be combined.
    private String boundName;

    // Whether the pattern should be negated
    private boolean isNegated;

    //Field restrictions. The Collection used ensures a ConditionCol has a back-reference to this Pattern
    private List<ConditionCol52> conditions;

    //CEP 'window' definition
    private CEPWindow window;

    //Entry-point name
    private String entryPointName;

    /**
     * Available fields for this type of column.
     */
    public static final String FIELD_FACT_TYPE = "factType";

    public static final String FIELD_BOUND_NAME = "boundName";

    public static final String FIELD_IS_NEGATED = "isNegated";

    public static final String FIELD_WINDOW = "window";

    public static final String FIELD_ENTRY_POINT_NAME = "entryPointName";


    public Pattern52() {
        this.conditions = new ArrayList<ConditionCol52>();
    }

    @Override
    public List<BaseColumnFieldDiff> diff(BaseColumn otherColumn) {
        if (otherColumn == null) return null;

        List<BaseColumnFieldDiff> result = new ArrayList<BaseColumnFieldDiff>();
        Pattern52 other = (Pattern52) otherColumn;



        // Field: factType.
        if ( !BaseColumnFieldDiffImpl.isEqualOrNull(this.getFactType(),
                other.getFactType()) ) {
            result.add(new BaseColumnFieldDiffImpl(FIELD_FACT_TYPE, this.getFactType(), other.getFactType()));
        }

        // Field: boundName.
        if ( !BaseColumnFieldDiffImpl.isEqualOrNull(this.getBoundName(),
                other.getBoundName()) ) {
            result.add(new BaseColumnFieldDiffImpl(FIELD_BOUND_NAME, this.getBoundName(), other.getBoundName()));
        }

        // Field: isNegated.
        if ( this.isNegated() != other.isNegated() ) {
            result.add(new BaseColumnFieldDiffImpl(FIELD_IS_NEGATED, this.isNegated(), other.isNegated()));
        }

        // Field: window.
        if ( !BaseColumnFieldDiffImpl.isEqualOrNull(this.getWindow(),
                other.getWindow()) ) {
            result.add(new BaseColumnFieldDiffImpl(FIELD_WINDOW, this.getWindow(), other.getWindow()));
        }

        // Field: entryPointName.
        if ( !BaseColumnFieldDiffImpl.isEqualOrNull(this.getEntryPointName(),
                other.getEntryPointName()) ) {
            result.add(new BaseColumnFieldDiffImpl(FIELD_ENTRY_POINT_NAME, this.getEntryPointName(), other.getEntryPointName()));
        }

        return result;
    }

    public String getFactType() {
        return factType;
    }

    public void setFactType( String factType ) {
        this.factType = factType;
    }

    public String getBoundName() {
        return boundName;
    }

    public boolean isBound() {
        return !( boundName == null || "".equals( boundName ) );
    }

    public void setBoundName( String boundName ) {
        this.boundName = boundName;
    }

    public boolean isNegated() {
        return isNegated;
    }

    public void setNegated( boolean negated ) {
        this.isNegated = negated;
    }

    public List<ConditionCol52> getChildColumns() {
        return this.conditions;
    }

    public void setChildColumns( List<ConditionCol52> conditions ) {
        this.conditions = conditions;
    }

    public void setWindow( CEPWindow window ) {
        this.window = window;
    }

    public CEPWindow getWindow() {
        if ( this.window == null ) {
            this.window = new CEPWindow();
        }
        return this.window;
    }

    public String getEntryPointName() {
        return entryPointName;
    }

    public void setEntryPointName( String entryPointName ) {
        this.entryPointName = entryPointName;
    }

    public String getHeader() {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public void setHeader( String header ) {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public boolean isHideColumn() {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public void setHideColumn( boolean hideColumn ) {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public int getWidth() {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public void setWidth( int width ) {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public DTCellValue52 getDefaultValue() {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

    public void setDefaultValue( DTCellValue52 defaultValue ) {
        throw new UnsupportedOperationException( "Operation only supported by child columns" );
    }

}
