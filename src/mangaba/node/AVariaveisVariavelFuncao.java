/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AVariaveisVariavelFuncao extends PVariavelFuncao
{
    private PTipo _tipo_;
    private TIdentificador _identificador_;
    private PExprLogica _exprLogica_;

    public AVariaveisVariavelFuncao()
    {
        // Constructor
    }

    public AVariaveisVariavelFuncao(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") PExprLogica _exprLogica_)
    {
        // Constructor
        setTipo(_tipo_);

        setIdentificador(_identificador_);

        setExprLogica(_exprLogica_);

    }

    @Override
    public Object clone()
    {
        return new AVariaveisVariavelFuncao(
            cloneNode(this._tipo_),
            cloneNode(this._identificador_),
            cloneNode(this._exprLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariaveisVariavelFuncao(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public PExprLogica getExprLogica()
    {
        return this._exprLogica_;
    }

    public void setExprLogica(PExprLogica node)
    {
        if(this._exprLogica_ != null)
        {
            this._exprLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._identificador_)
            + toString(this._exprLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._exprLogica_ == child)
        {
            this._exprLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._exprLogica_ == oldChild)
        {
            setExprLogica((PExprLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}