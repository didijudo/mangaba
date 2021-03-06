/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoExprBlocoExpr extends PBlocoExpr
{
    private PBlocoExpr _blocoExpr_;
    private PExpr _expr_;

    public ABlocoExprBlocoExpr()
    {
        // Constructor
    }

    public ABlocoExprBlocoExpr(
        @SuppressWarnings("hiding") PBlocoExpr _blocoExpr_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setBlocoExpr(_blocoExpr_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoExprBlocoExpr(
            cloneNode(this._blocoExpr_),
            cloneNode(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoExprBlocoExpr(this);
    }

    public PBlocoExpr getBlocoExpr()
    {
        return this._blocoExpr_;
    }

    public void setBlocoExpr(PBlocoExpr node)
    {
        if(this._blocoExpr_ != null)
        {
            this._blocoExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoExpr_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoExpr_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoExpr_ == child)
        {
            this._blocoExpr_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoExpr_ == oldChild)
        {
            setBlocoExpr((PBlocoExpr) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
