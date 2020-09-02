import React from 'react';
import Avatar from '@material-ui/core/Avatar';
import Button from '@material-ui/core/Button';
import CssBaseline from '@material-ui/core/CssBaseline';
import FormControl from '@material-ui/core/FormControl';
import Input from '@material-ui/core/Input';
import InputLabel from '@material-ui/core/InputLabel';
import LockIcon from '@material-ui/icons/LockOutlined';
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';
import SearchIcon from '@material-ui/icons/Search';
import Box from '@material-ui/core/Box';
import TextField from '@material-ui/core/TextField';
import {InfoUser} from './infoUser'



export class ConsultaUser extends React.Component{
    constructor(props) {
        super(props);
        this.state={busq:"", items:[]};
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChangeBus=this.handleChangeBus.bind(this);
    }
    
    render(){
        return (
              <Paper className="paper">
                  <Typography variant="h3" noWrap>Busqueda de usuarios</Typography>
                  <Box component="span" p={1}>
                    <TextField
                    id="busq"
                    onChange={this.handleChangeBus}
                    value={this.state.busq}
                    label="Busqueda"
                    variant="outlined"
                    />
                    </Box>
                    <Box component="span" p={1}>
                    <Button
                          type="submit"
                          variant="raised"
                          color="secondary"
                          className="submit"
                          onClick={this.handleSubmit}
                          >
                          <SearchIcon/>
                      </Button>
                    </Box>
                    <Box component="span" p={1}>
                    <InfoUser todoList={this.state.items}/>
                    </Box>
              </Paper>
        );
    }

    handleSubmit(e) {
      const newItem = {
        busq: this.state.busq
    };
    this.setState(prevState => ({
      items: prevState.items.concat(newItem),
      busq: ''
    }));
    
    console.log(this.state.items)
    }

    handleChangeBus(e) {
        this.setState({
          busq: e.target.value
        });
    }
  }