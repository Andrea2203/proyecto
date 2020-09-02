  
import React from 'react';
import { Box } from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
export class InfoUser extends React.Component {

    render() {
        const todoList = this.props.todoList.map((todo, i) => {
            return (
                
                      <TableRow key={todo.busq}>
                        <TableCell component="th" scope="row">
                          {todo.busq}
                        </TableCell>
                        <TableCell align="right">Andrea</TableCell>
                        <TableCell align="right">Rodiguez</TableCell>
                        <TableCell align="right">100km</TableCell>
                        <TableCell align="right">1 Bono</TableCell>
                      </TableRow>
            );
        });
        return (
            <TableContainer component={Paper}>
                <Table  aria-label="simple table">
                  <TableHead>
                    <TableRow>
                      <TableCell>Usuario</TableCell>
                      <TableCell align="right">Nombre</TableCell>
                      <TableCell align="right">Apellido</TableCell>
                      <TableCell align="right">Distancia total recorrida</TableCell>
                      <TableCell align="right">Cantidad de bonos reclamados</TableCell>
                    </TableRow>
                  </TableHead>
                  <TableBody>
                {todoList}
            
                </TableBody>
                </Table>
              </TableContainer>
        );


    }

}