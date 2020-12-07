unit uFrmPrincipal;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs,  uVenda, uVendaItem, Vcl.ExtCtrls , System.Generics.Collections ,
  Vcl.StdCtrls;

type
  TForm1 = class(TForm)
    Button1: TButton;
    procedure Button1Click(Sender: TObject);
    procedure FormCreate(Sender: TObject);
    procedure FormDestroy(Sender: TObject);
  private
    tempListaVendas : TObjectList<TVenda>;
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject);
var
 tempVenda: TVenda;
begin
  tempVenda := TVenda.Create;
  tempVenda.IDVenda := 1;
  tempVenda.Data    := Now;
  tempVenda.AdicionarVendaItem('Sony Vaio XR8472');

  //salvar no banco de dados
  tempListaVendas.Add(tempVenda);


  FreeAndNil(tempVenda);
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  tempListaVendas := TObjectList<TVenda>.create;
end;

procedure TForm1.FormDestroy(Sender: TObject);
begin
 FreeAndNil(tempListaVendas);
end;

end.
